package androidx.credentials.provider.utils;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.credentials.CreateEntry;
import android.util.Log;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/credentials/provider/CreateEntry;", "entry", "Landroid/service/credentials/CreateEntry;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BeginCreateCredentialUtil$Companion$convertToJetpackResponse$1 extends Lambda implements Function1<CreateEntry, androidx.credentials.provider.CreateEntry> {
    public static final BeginCreateCredentialUtil$Companion$convertToJetpackResponse$1 h = new BeginCreateCredentialUtil$Companion$convertToJetpackResponse$1(1);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Slice slice = a.o(obj).getSlice();
        Intrinsics.g(slice, "entry.slice");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<SliceItem> items = slice.getItems();
        Intrinsics.g(items, "slice.items");
        LinkedHashMap linkedHashMapB = linkedHashMap;
        CharSequence text = null;
        PendingIntent action = null;
        Icon icon = null;
        CharSequence text2 = null;
        Instant instantOfEpochMilli = null;
        boolean z = false;
        for (SliceItem sliceItem : items) {
            if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME")) {
                text = sliceItem.getText();
            } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON")) {
                icon = sliceItem.getIcon();
            } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT")) {
                action = sliceItem.getAction();
            } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION")) {
                Bundle bundle = sliceItem.getBundle();
                HashMap map = new HashMap();
                if (bundle != null) {
                    Set<String> setKeySet = bundle.keySet();
                    Intrinsics.g(setKeySet, "bundle.keySet()");
                    for (String it : setKeySet) {
                        try {
                            Intrinsics.g(it, "it");
                            map.put(it, Integer.valueOf(bundle.getInt(it)));
                        } catch (Exception e) {
                            Log.i("CreateEntry", "Issue unpacking credential count info bundle: " + e.getMessage());
                        }
                    }
                }
                linkedHashMapB = TypeIntrinsics.b(map);
            } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
            } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_NOTE")) {
                text2 = sliceItem.getText();
            } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
            } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED") && Intrinsics.c(sliceItem.getText(), "true")) {
                z = true;
            }
        }
        try {
            Intrinsics.e(text);
            Intrinsics.e(action);
            return new androidx.credentials.provider.CreateEntry(text, action, icon, text2, instantOfEpochMilli, linkedHashMapB, z);
        } catch (Exception e2) {
            Log.i("CreateEntry", "fromSlice failed with: " + e2.getMessage());
            return null;
        }
    }
}
