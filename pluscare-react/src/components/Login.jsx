import * as React from 'react';
import axios from 'axios';
import { useState } from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Button } from '@mui/material';
import InputLabel from '@mui/material/InputLabel';
import MenuItem from '@mui/material/MenuItem';
import FormControl from '@mui/material/FormControl';
import Select from '@mui/material/Select';
import { useNavigate } from 'react-router-dom';

function Login()
{
  
  const [inputs, setInputs] = useState({});
  const navigate = useNavigate();

  const handleChange = (event) => 
  {
      const name = event.target.name;
      const value = event.target.value;
      setInputs(values => ({...values, [name]: value}))
  }
  
  const handleKeyDown = (event) =>
  {
    if(event.key==='Enter')
    {
      console.log("Enter key pressed")
      handleLogin(event);
    }
  }

  const handleLogin = (event) => 
  {
      event.preventDefault();
      console.log(inputs);
      axios.post('http://localhost:8080/verifylogin', inputs)
          .then(response => {
              // Handle successful response
              console.log('Data sent successfully:', response.data);
              if(response.data.userType==='admin')
              {
                navigate('/welcomeadmin');
              }
              else if(response.data.userType==='doctor')
              {
                navigate('/welcomedoctor');
              }
          })
          .catch(error => {
              // Handle errors
              console.error('Error sending data:', error);
          });
  }
  
  return (
        <>
            <Box
              align='center'
              component="form"
              sx={{ '& > :not(style)': { m: 1, width: '35ch' } }}
              noValidate
              autoComplete="off"
              onKeyDown={handleKeyDown}
            >
                <h1>Login to PlusCare</h1><br/>
                <FormControl required variant="filled" sx={{ m: 1, minWidth: 120 }}>
                  <InputLabel id="demo-simple-select-filled-label">Login As</InputLabel>
                  <Select
                    labelId="demo-simple-select-filled-label"
                    id="demo-simple-select-filled"
                    name="userType"
                    value={inputs.userType || ''}
                    onChange={handleChange}
                  >
                    <MenuItem value="">
                      <em>None</em>
                    </MenuItem>
                    <MenuItem value={'admin'}>Admin</MenuItem>
                    <MenuItem value={'doctor'}>Doctor</MenuItem>
                    <MenuItem value={'assistant'}>Assistant</MenuItem>
                    <MenuItem value={'patient'}>Patient</MenuItem>
                  </Select>
                </FormControl>
                <br/>
                <TextField required 
                    id="filled-basic" 
                    label="Email" 
                    variant="filled"
                    name = "email"
                    value = {inputs.email || ''}
                    onChange = {handleChange} 
                />
                <br/>
                <TextField required
                    id="filled-password-input"
                    label="Password"
                    type="password"
                    autoComplete="current-password"
                    variant="filled"
                    name = "password"
                    value = {inputs.password || ''}
                    onChange = {handleChange}
                />
                <br/>
                <Button onClick={handleLogin} variant="contained">Login</Button>
            </Box>
        </>
    );
}

export default Login;
