/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.mail;

import static org.junit.Assert.*;

import javax.mail.PasswordAuthentication;

import org.junit.Test;

/**
 * JUnit test case for DefaultAuthenticator Class.
 *
 * @since 1.0
 * @version $Id$
 */
public class DefaultAuthenticatorTest
{
    @Test
    public void testDefaultAuthenticatorConstructor()
    {
        //insert code testing basic functionality
        String strUsername = "user.name";
        String strPassword = "user.pwd";
        DefaultAuthenticator authenticator = new DefaultAuthenticator(strUsername, strPassword);

        assertTrue(
            PasswordAuthentication.class.isInstance(
                    authenticator.getPasswordAuthentication()));
        assertEquals(
                strUsername,
                authenticator.getPasswordAuthentication().getUserName());
        assertEquals(
            strPassword,
            authenticator.getPasswordAuthentication().getPassword());
    }

}
