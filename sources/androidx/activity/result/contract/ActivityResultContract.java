package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\nJ!\u0010\b\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContract;", "I", "O", "", "", "resultCode", "Landroid/content/Intent;", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Object;", "SynchronousResult", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SynchronousResult<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f84a;

        public SynchronousResult(Object obj) {
            this.f84a = obj;
        }

        /* renamed from: a, reason: from getter */
        public final Object getF84a() {
            return this.f84a;
        }
    }

    public abstract Intent createIntent(Context context, Object obj);

    public SynchronousResult getSynchronousResult(Context context, Object obj) {
        return null;
    }

    public abstract O parseResult(int resultCode, @Nullable Intent intent);
}
