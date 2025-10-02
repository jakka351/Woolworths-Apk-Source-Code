package dagger.hilt.android.internal.builders;

import androidx.lifecycle.SavedStateHandle;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;

@DefineComponent.Builder
/* loaded from: classes.dex */
public interface ViewModelComponentBuilder {
    ViewModelComponentBuilder a(SavedStateHandle savedStateHandle);

    ViewModelComponentBuilder b(RetainedLifecycleImpl retainedLifecycleImpl);

    ViewModelComponent build();
}
