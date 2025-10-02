package dagger.hilt.android.internal.builders;

import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.managers.SavedStateHandleHolder;

@DefineComponent.Builder
/* loaded from: classes.dex */
public interface ActivityRetainedComponentBuilder {
    ActivityRetainedComponentBuilder a(SavedStateHandleHolder savedStateHandleHolder);

    ActivityRetainedComponent build();
}
