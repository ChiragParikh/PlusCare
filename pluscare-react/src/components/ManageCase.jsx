import Tooltip from '@mui/material/Tooltip';
import AddIcon from '@mui/icons-material/Add';
import {
  GridRowModes,
  DataGrid,
  GridActionsCellItem,
  GridRowEditStopReasons,
  Toolbar,
  ToolbarButton,
} from '@mui/x-data-grid';
import axios from 'axios';
import { useState } from 'react';

let initialRows = [];

function EditToolbar(props) {
  const { setRows, setRowModesModel } = props;
  const tempId = `temp-${Math.random()}`; // temporary unique ID

  const handleClick = () => {
    setRows((oldRows) => [
      ...oldRows,
      { caseNo: tempId, date:'', patientId:'', doctorId:'', symptoms:'', diagnosis:'', advice:'', fees:'', isNew: true },
    ]);
    setRowModesModel((oldModel) => ({
      ...oldModel,
      [tempId]: { mode: GridRowModes.Edit, fieldToFocus: 'patientId' },
    }));
  };

  return (
    <Toolbar>
      <Tooltip title="Add record">
        <ToolbarButton onClick={handleClick}>
          <AddIcon fontSize="small" />
        </ToolbarButton>
      </Tooltip>
    </Toolbar>
  );
}

function ManageCase()
{
    return(
        <>
            <h1>Manage Case Page</h1>
        </>
    );
}
export default ManageCase;
