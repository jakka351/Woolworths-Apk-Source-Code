package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.parking.ParkingVoucherActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class ActivityBuilderModule_BindParkingVoucherActivity {

    @ActivityScope
    @Subcomponent
    public interface ParkingVoucherActivitySubcomponent extends AndroidInjector<ParkingVoucherActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<ParkingVoucherActivity> {
        }
    }
}
