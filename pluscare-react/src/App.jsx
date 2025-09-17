import * as React from 'react';
import './App.css';
import Login from './components/Login';
import {BrowserRouter,Routes,Route} from "react-router-dom";
import AddDoctor from './components/AddDoctor';
import WelcomeAdmin from './components/WelcomeAdmin';
import ManageDoctor from './components/ManageDoctor';
import WelcomeDoctor from './components/WelcomeDoctor';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/login" element={<Login />} />
        <Route path="/registerdoctor" element={<AddDoctor />} />
        <Route path = "/welcomeadmin" element = {<WelcomeAdmin />} />
        <Route path = "/managedoctor" element = {<ManageDoctor />} />
        <Route path = "/welcomedoctor" element = {<WelcomeDoctor />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
