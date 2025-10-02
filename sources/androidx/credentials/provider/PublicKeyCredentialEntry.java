package androidx.credentials.provider;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/PublicKeyCredentialEntry;", "Landroidx/credentials/provider/CredentialEntry;", "Api28Impl", "Builder", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PublicKeyCredentialEntry extends CredentialEntry {
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final PendingIntent f;
    public final Icon g;
    public final Instant h;
    public final boolean i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/PublicKeyCredentialEntry$Api28Impl;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi
    @SourceDebugExtension
    public static final class Api28Impl {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/PublicKeyCredentialEntry$Builder;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004¨\u0006\u0014"}, d2 = {"Landroidx/credentials/provider/PublicKeyCredentialEntry$Companion;", "", "", "AUTO_SELECT_FALSE_STRING", "Ljava/lang/String;", "AUTO_SELECT_TRUE_STRING", "", "REVISION_ID", "I", "SLICE_HINT_AUTO_ALLOWED", "SLICE_HINT_AUTO_SELECT_FROM_OPTION", "SLICE_HINT_DEFAULT_ICON_RES_ID", "SLICE_HINT_ICON", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_OPTION_ID", "SLICE_HINT_PENDING_INTENT", "SLICE_HINT_SUBTITLE", "SLICE_HINT_TITLE", "SLICE_HINT_TYPE_DISPLAY_NAME", "TAG", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static PublicKeyCredentialEntry a(Slice slice) {
            List<SliceItem> items = slice.getItems();
            Intrinsics.g(items, "slice.items");
            boolean z = false;
            CharSequence text = null;
            CharSequence text2 = null;
            CharSequence text3 = null;
            CharSequence text4 = null;
            PendingIntent action = null;
            Icon icon = null;
            Instant instantOfEpochMilli = null;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME")) {
                    text4 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME")) {
                    text2 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME")) {
                    text3 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON")) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT")) {
                    action = sliceItem.getAction();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID")) {
                    text = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                    instantOfEpochMilli = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED")) {
                    if (Intrinsics.c(sliceItem.getText(), "true")) {
                        z = true;
                    }
                } else if (!sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION")) {
                    sliceItem.hasHint("androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID");
                }
            }
            try {
                Intrinsics.e(text2);
                Intrinsics.e(text4);
                Intrinsics.e(action);
                Intrinsics.e(icon);
                Bundle bundle = new Bundle();
                Intrinsics.e(text);
                String id = text.toString();
                Intrinsics.h(id, "id");
                return new PublicKeyCredentialEntry(text2, text3, text4, action, icon, instantOfEpochMilli, z, new BeginGetPublicKeyCredentialOption(bundle, id, "{\"dummy_key\":\"dummy_value\"}"));
            } catch (Exception e) {
                Log.i("PublicKeyCredEntry", "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }
    }

    public PublicKeyCredentialEntry(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PendingIntent pendingIntent, Icon icon, Instant instant, boolean z, BeginGetPublicKeyCredentialOption beginGetPublicKeyCredentialOption) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", beginGetPublicKeyCredentialOption);
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = pendingIntent;
        this.g = icon;
        this.h = instant;
        this.i = z;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("username must not be empty");
        }
        if (charSequence3.length() <= 0) {
            throw new IllegalArgumentException("typeDisplayName must not be empty");
        }
    }
}
