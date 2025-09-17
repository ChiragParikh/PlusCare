import * as React from 'react';
import Box from '@mui/material/Box';
import Tooltip from '@mui/material/Tooltip';
import AddIcon from '@mui/icons-material/Add';
import EditIcon from '@mui/icons-material/Edit';
import DeleteIcon from '@mui/icons-material/DeleteOutlined';
import SaveIcon from '@mui/icons-material/Save';
import CancelIcon from '@mui/icons-material/Close';
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
      { id: tempId, firstName: '', lastName: '', doctorId: '', contact:'', email:'',password:'', isNew: true },
    ]);
    setRowModesModel((oldModel) => ({
      ...oldModel,
      [tempId]: { mode: GridRowModes.Edit, fieldToFocus: 'firstName' },
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

function ManageAssistant()
{
    return (
        <>
            <h1>Manage Assistant Page</h1>
        </>
    );
}
export default ManageAssistant;
