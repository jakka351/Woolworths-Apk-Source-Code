package dagger.hilt.android.internal.builders;

import android.app.Activity;
import dagger.hilt.DefineComponent;
import dagger.hilt.android.components.ActivityComponent;

@DefineComponent.Builder
/* loaded from: classes.dex */
public interface ActivityComponentBuilder {
    ActivityComponentBuilder a(Activity activity);

    ActivityComponent build();
}
