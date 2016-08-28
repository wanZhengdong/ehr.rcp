package ehr.rcp.provider;

import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class CommonTreeContentProvier implements ITreeContentProvider
{
    
    @Override
    public void dispose()
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
    {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public Object[] getElements(Object inputElement)
    {
        String[] test=new String[]{"a","b","c"};
        return test;
    }
    
    @Override
    public Object[] getChildren(Object parentElement)
    {
        String[] test=new String[]{"a","b","c"};
        return test;
    }
    
    @Override
    public Object getParent(Object element)
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public boolean hasChildren(Object element)
    {
        // TODO Auto-generated method stub
        return false;
    }
    
}
