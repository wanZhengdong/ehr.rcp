package com.pd.ehr.rcp.shell;

import java.util.ResourceBundle;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SingletonNumberSwtVo extends SingletonNumberVo
{
    private Text[] textArr;
    
    private Shell shell;
    
    private Display display;
    
    public SingletonNumberSwtVo(String inStr)
    {
        super(inStr);
        init();
        show();
        start();
    }
    
    public void show()
    {
        shell.layout();
    }
    
    public void start()
    {
        while (!shell.isDisposed())
        
        {
            if (!display.readAndDispatch())
            {
                display.sleep();
            }
        }
    }
    
    public void init()
    {
        display = Display.getDefault();
        shell = new Shell(display);
        shell.setText("Hello SWT");
        shell.setSize(500, 500);
        shell.open();
        
        textArr = new Text[81];
        
        for (int i = 0; i < 81; i++)
        {
            textArr[i] = new Text(shell, SWT.BORDER);
            int left = i % 9 * 20;
            int top = i / 9 * 20;
            int right = left + 20;
            int down = top + 20;
            textArr[i].setBounds(left, top, 20, 20);
            textArr[i].setTextLimit(1);
            int tmpValue = values[i];
            if (tmpValue != 0)
            {
                textArr[i].setText(tmpValue + "");
                values[i] = tmpValue;
                textArr[i].setEditable(false);
                textArr[i].setBackground(new Color(null, 0, 255, 0));
            }
        }
    }

    public boolean finish()
    {
        return false;
    }

    public void execute()
    {
        // TODO Auto-generated method stub
        
    }
    
}
