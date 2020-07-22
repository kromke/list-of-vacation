import React from 'react';


export default function Authorisation() {

        return (
        <fieldset className = 'authorisation' >
                <legend>
                        <small>
                                авторизация
                        </small>
                </legend>
                <input type = 'text' placeholder = 'login'/>
                <input type = 'password' placeholder = 'password' /> <button className = 'submit'>check</button>
                </fieldset>
        );
    
}