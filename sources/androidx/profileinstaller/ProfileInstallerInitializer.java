package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.RequiresApi;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements Initializer<Result> {

    @RequiresApi
    public static class Handler28Impl {
    }

    public static class Result {
    }

    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: androidx.profileinstaller.b
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Handler handlerCreateAsync = Handler.createAsync(Looper.getMainLooper());
                int iNextInt = new Random().nextInt(Math.max(1000, 1));
                handlerCreateAsync.postDelayed(new c(applicationContext, 0), iNextInt + 5000);
            }
        });
        return new Result();
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
