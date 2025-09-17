import * as React from 'react';
import PropTypes from 'prop-types';
import Tabs from '@mui/material/Tabs';
import Tab from '@mui/material/Tab';
import Box from '@mui/material/Box';
import RegisterCase from './RegisterCase';
import ManageAssistant from './ManageAssistant';
import ManagePatient from './ManagePatient';

function TabPanel(props) {
  const { children, value, index, ...other } = props;

  return (
    <div
      role="tabpanel"
      hidden={value !== index}
      id={`vertical-tabpanel-${index}`}
      aria-labelledby={`vertical-tab-${index}`}
      {...other}
    >
      {value === index && (
        <Box sx={{ p: 3 }}>
          {children}
        </Box>
      )}
    </div>
  );
}

TabPanel.propTypes = {
  children: PropTypes.node,
  index: PropTypes.number.isRequired,
  value: PropTypes.number.isRequired,
};

function a11yProps(index) {
  return {
    id: `vertical-tab-${index}`,
    'aria-controls': `vertical-tabpanel-${index}`,
  };
}

function WelcomeDoctor()
{
  const [value, setValue] = React.useState(0);

  const handleChange = (event, newValue) => {
    setValue(newValue);
  };

  return (
    <Box
      sx={{ flexGrow: 1, bgcolor: 'background.paper', display: 'flex', height: 224 }}
    >
      <Tabs
        orientation="vertical"
        variant="scrollable"
        value={value}
        onChange={handleChange}
        aria-label="Vertical tabs example"
        sx={{ borderRight: 1, borderColor: 'divider' }}
      >
        <Tab label="Register Case" {...a11yProps(0)} />
        <Tab label="Manage Assistant" {...a11yProps(1)} />
        <Tab label="Manage Patient" {...a11yProps(2)} />
      </Tabs>
      <TabPanel value={value} index={0}>
        <RegisterCase/>
      </TabPanel>
      <TabPanel value={value} index={1}>
        <ManageAssistant/>
      </TabPanel>
      <TabPanel value={value} index={2}>
        <ManagePatient/>
      </TabPanel>
    </Box>
  );
}

export default WelcomeDoctor;