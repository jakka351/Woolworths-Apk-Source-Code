package dagger.hilt.android.internal.builders;

import android.view.View;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ViewComponent;

@DefineComponent.Builder
/* loaded from: classes7.dex */
public interface ViewComponentBuilder {
    ViewComponentBuilder a(View view);

    ViewComponent build();
}
