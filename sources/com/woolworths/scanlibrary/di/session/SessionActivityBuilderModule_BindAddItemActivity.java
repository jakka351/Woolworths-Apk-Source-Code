package com.woolworths.scanlibrary.di.session;

import com.woolworths.scanlibrary.di.scope.ActivityScope;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemActivity;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Module
/* loaded from: classes7.dex */
public abstract class SessionActivityBuilderModule_BindAddItemActivity {

    @ActivityScope
    @Subcomponent
    public interface AddItemActivitySubcomponent extends AndroidInjector<AddItemActivity> {

        @Subcomponent.Factory
        public interface Factory extends AndroidInjector.Factory<AddItemActivity> {
        }
    }
}
