/*
 * common - com.bxl.common.util - PasswordHashTest        
 *
 * @author Bao Xiaolu
 * @contact baoxiaolumail@gmail.com
 * @date 2017/2/2
 * 
 * Copyright © https://github.com/CharlotteBao
 * All rights reserved.
 */
package com.bxl.common.test.util;

import com.bxl.common.feature.test.TestSupport;
import com.bxl.common.util.PasswordHash;
import org.junit.Assert;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class PasswordHashTest extends TestSupport {

    @Test
    public void testValidate() {

        start();

        String password = "123456";
        logger.info("password: " + password);

        try {
            String hashPassword = PasswordHash.createHash(password);
            logger.info("hashPassword: " + hashPassword);

            Assert.assertTrue(PasswordHash.validatePassword(password, hashPassword));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }

        end();

    }
}
