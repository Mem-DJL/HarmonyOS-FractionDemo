package com.example.fractiondemo.slice;

import com.example.fractiondemo.ResourceTable;
import com.example.fractiondemo.fraction.ExampleFraction;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.ability.fraction.FractionAbility;
import ohos.aafwk.content.Intent;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        // 将ExampleFraction添加到声明的栈布局容器中
        ((FractionAbility) getAbility()).getFractionManager()	// 获得FractionManager对象
                .startFractionScheduler()						// 开启一个Fraction事务
                .add(ResourceTable.Id_fraction_container, new ExampleFraction(), "example_fraction")
                .submit();  // 提交事务
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
