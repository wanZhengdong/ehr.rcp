package com.pd.ehr.rcp.shell;

public class SingletonNumberVo
{
    
    protected int[] values = new int[81];
    
    protected int problems;
    
    public SingletonNumberVo(String inStr)
    {
        inStr = inStr.replaceAll(",", "");
        problems = 81;
        for (int i = 0; i < 81; i++)
        {
            int tmpValue = Integer.valueOf(inStr.substring(i, i + 1));
            if (tmpValue != 0)
            {
                values[i] = tmpValue;
                problems--;
            }
        }
    }
}
