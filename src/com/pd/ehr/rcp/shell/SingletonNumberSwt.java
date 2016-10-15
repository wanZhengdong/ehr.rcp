package com.pd.ehr.rcp.shell;

import org.eclipse.swt.widgets.Shell;

public class SingletonNumberSwt extends Shell
{
    private SingletonNumberSwtVo vo;
    
    public SingletonNumberSwt(SingletonNumberSwtVo vo)
    {
        this.vo = vo;
    }
    
    public void executeAll()
    {
        while (!vo.finish())
        {
            vo.execute();
        }
    }
    
}
