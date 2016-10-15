package com.pd.ehr.rcp.shell;

import java.util.ResourceBundle;

import org.junit.Test;

public class SingletonNumberSwtTest
{
    
    @Test
    public void testSingletonNumberSwt()
    {
        ResourceBundle bundle = ResourceBundle.getBundle("com.pd.ehr.rcp.shell.SingletonNumberSwt");
        SingletonNumberSwtVo vo = new SingletonNumberSwtVo(bundle.getString("in"));
        SingletonNumberSwt swt = new SingletonNumberSwt(vo);
        swt.executeAll();
    }
    
}
