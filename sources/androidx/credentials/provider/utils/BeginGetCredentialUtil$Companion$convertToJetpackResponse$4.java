package androidx.credentials.provider.utils;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.service.credentials.Action;
import android.util.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/credentials/provider/Action;", "entry", "Landroid/service/credentials/Action;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BeginGetCredentialUtil$Companion$convertToJetpackResponse$4 extends Lambda implements Function1<Action, androidx.credentials.provider.Action> {
    public static final BeginGetCredentialUtil$Companion$convertToJetpackResponse$4 h = new BeginGetCredentialUtil$Companion$convertToJetpackResponse$4(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Slice slice = d.k(obj).getSlice();
        Intrinsics.g(slice, "entry.slice");
        List<SliceItem> items = slice.getItems();
        Intrinsics.g(items, "slice.items");
        CharSequence text = "";
        PendingIntent action = null;
        CharSequence text2 = null;
        for (SliceItem sliceItem : items) {
            if (sliceItem.hasHint("androidx.credentials.provider.action.HINT_ACTION_TITLE")) {
                text = sliceItem.getText();
                Intrinsics.g(text, "it.text");
            } else if (sliceItem.hasHint("androidx.credentials.provider.action.HINT_ACTION_SUBTEXT")) {
                text2 = sliceItem.getText();
            } else if (sliceItem.hasHint("androidx.credentials.provider.action.SLICE_HINT_PENDING_INTENT")) {
                action = sliceItem.getAction();
            }
        }
        try {
            Intrinsics.e(action);
            return new androidx.credentials.provider.Action(text, action, text2);
        } catch (Exception e) {
            Log.i("Action", "fromSlice failed with: " + e.getMessage());
            return null;
        }
    }
}
