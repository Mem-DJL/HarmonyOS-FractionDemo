package com.example.fractiondemo.fraction;

import com.example.fractiondemo.ResourceTable;
import ohos.aafwk.ability.fraction.Fraction;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.ComponentContainer;
import ohos.agp.components.LayoutScatter;

public class ExampleFraction extends Fraction {

    @Override
    protected Component onComponentAttached(LayoutScatter scatter, ComponentContainer container, Intent intent) {
        // Fraction的布局ID
        int layoutId = ResourceTable.Layout_fraction_example;
        // 将布局文件转换成组件对象
        Component cpt = scatter.parse(layoutId, container, false);
        // 返回组件对象
        return cpt;
    }
}
