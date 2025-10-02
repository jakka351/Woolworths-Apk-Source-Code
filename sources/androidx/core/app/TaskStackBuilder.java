package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class TaskStackBuilder implements Iterable<Intent> {
    public final ArrayList d = new ArrayList();
    public final Context e;

    /* loaded from: classes.dex */
    public interface SupportParentable {
        Intent getSupportParentActivityIntent();
    }

    public TaskStackBuilder(Context context) {
        this.e = context;
    }

    public static TaskStackBuilder g(AppCompatActivity appCompatActivity) {
        return new TaskStackBuilder(appCompatActivity);
    }

    public final void b(ComponentName componentName) {
        Context context = this.e;
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        try {
            for (Intent intentA = NavUtils.a(context, componentName); intentA != null; intentA = NavUtils.a(context, intentA.getComponent())) {
                arrayList.add(size, intentA);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void d(AppCompatActivity appCompatActivity) {
        Intent supportParentActivityIntent = appCompatActivity.getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = NavUtils.b(appCompatActivity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.e.getPackageManager());
            }
            b(component);
            this.d.add(supportParentActivityIntent);
        }
    }

    public final void h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.e.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator<Intent> iterator() {
        return this.d.iterator();
    }
}
