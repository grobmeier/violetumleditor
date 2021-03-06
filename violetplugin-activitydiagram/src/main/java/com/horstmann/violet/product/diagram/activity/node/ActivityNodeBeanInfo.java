package com.horstmann.violet.product.diagram.activity.node;

import java.beans.PropertyDescriptor;
import java.util.List;

import com.horstmann.violet.product.diagram.abstracts.node.AbstractNodeBeanInfo;
import com.horstmann.violet.product.diagram.activity.ActivityDiagramConstant;

/**
 * The bean info for the ActivityNodeBeanInfo type.
 */
public class ActivityNodeBeanInfo extends AbstractNodeBeanInfo
{
    public ActivityNodeBeanInfo()
    {
        super(ActivityNode.class);
        addResourceBundle(ActivityDiagramConstant.ACTIVITY_DIAGRAM_RESOURCE);
    }

    @Override
    protected List<PropertyDescriptor> createPropertyDescriptorList()
    {
        List<PropertyDescriptor> propertyDescriptorList = super.createPropertyDescriptorList();
        propertyDescriptorList.add(createPropertyDescriptor(NAME_VAR_NAME, NAME_LABEL_KEY,1));
        return propertyDescriptorList;
    }

    private static final String NAME_LABEL_KEY = "activity_node.name";
    private static final String NAME_VAR_NAME = "name";
}
