package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroid/view/View;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/viewbinding/ViewBinding;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class AndroidViewBindingKt$AndroidViewBinding$5$1 extends Lambda implements Function1<Context, View> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater.from((Context) obj);
        throw null;
    }
}
