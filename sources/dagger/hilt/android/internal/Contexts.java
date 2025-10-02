package dagger.hilt.android.internal;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class Contexts {
    public static Application a(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
            if (baseContext instanceof Application) {
                return (Application) baseContext;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }
}
