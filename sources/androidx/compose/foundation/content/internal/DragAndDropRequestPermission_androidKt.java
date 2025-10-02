package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DragAndDropRequestPermission_androidKt {
    public static final void a(DelegatableNode delegatableNode, DragAndDropEvent dragAndDropEvent) {
        Activity activity;
        ClipData clipData = dragAndDropEvent.f1739a.getClipData();
        int itemCount = clipData.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            Uri uri = clipData.getItemAt(i).getUri();
            if (uri != null && Intrinsics.c(uri.getScheme(), "content")) {
                if (delegatableNode.getD().q) {
                    Context context = DelegatableNode_androidKt.a(delegatableNode).getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity == null) {
                        return;
                    }
                    activity.requestDragAndDropPermissions(dragAndDropEvent.f1739a);
                    return;
                }
                return;
            }
        }
    }
}
