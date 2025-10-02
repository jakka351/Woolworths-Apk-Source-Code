package androidx.credentials.provider;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.time.Instant;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/credentials/provider/CreateEntry;", "", "Api28Impl", "Builder", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CreateEntry {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2535a;
    public final PendingIntent b;
    public final Icon c;
    public final CharSequence d;
    public final Instant e;
    public final Map f;
    public final boolean g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/CreateEntry$Api28Impl;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresApi
    @SourceDebugExtension
    public static final class Api28Impl {
        public static final Bundle a(Map credentialCountInformationMap) {
            Intrinsics.h(credentialCountInformationMap, "credentialCountInformationMap");
            Bundle bundle = new Bundle();
            boolean z = false;
            for (Map.Entry entry : credentialCountInformationMap.entrySet()) {
                if (entry.getValue() != null) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    Intrinsics.e(value);
                    bundle.putInt(str, ((Number) value).intValue());
                    z = true;
                }
            }
            if (z) {
                return bundle;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/provider/CreateEntry$Builder;", "", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004¨\u0006\u0014"}, d2 = {"Landroidx/credentials/provider/CreateEntry$Companion;", "", "", "AUTO_SELECT_FALSE_STRING", "Ljava/lang/String;", "AUTO_SELECT_TRUE_STRING", "", "DESCRIPTION_MAX_CHAR_LIMIT", "I", "REVISION_ID", "SLICE_HINT_ACCOUNT_NAME", "SLICE_HINT_AUTO_SELECT_ALLOWED", "SLICE_HINT_CREDENTIAL_COUNT_INFORMATION", "SLICE_HINT_ICON", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_NOTE", "SLICE_HINT_PENDING_INTENT", "SLICE_SPEC_TYPE", "TAG", "TYPE_TOTAL_CREDENTIAL", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static Slice a(CreateEntry createEntry) {
            Intrinsics.h(createEntry, "createEntry");
            CharSequence charSequence = createEntry.f2535a;
            Icon icon = createEntry.c;
            CharSequence charSequence2 = createEntry.d;
            Instant instant = createEntry.e;
            Map map = createEntry.f;
            PendingIntent pendingIntent = createEntry.b;
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("CreateEntry", 1));
            String str = createEntry.g ? "true" : "false";
            builder.addText(charSequence, null, CollectionsKt.Q("androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME"));
            if (instant != null) {
                builder.addLong(instant.toEpochMilli(), null, CollectionsKt.Q("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
            }
            if (charSequence2 != null) {
                builder.addText(charSequence2, null, CollectionsKt.Q("androidx.credentials.provider.createEntry.SLICE_HINT_NOTE"));
            }
            if (icon != null) {
                builder.addIcon(icon, null, CollectionsKt.Q("androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON"));
            }
            if (Api28Impl.a(map) != null) {
                builder.addBundle(Api28Impl.a(map), null, CollectionsKt.Q("androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION"));
            }
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT")).build(), null).addText(str, null, CollectionsKt.Q("androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED"));
            Slice sliceBuild = builder.build();
            Intrinsics.g(sliceBuild, "sliceBuilder.build()");
            return sliceBuild;
        }
    }

    public CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, Icon icon, CharSequence charSequence2, Instant instant, Map credentialCountInformationMap, boolean z) {
        Intrinsics.h(credentialCountInformationMap, "credentialCountInformationMap");
        this.f2535a = charSequence;
        this.b = pendingIntent;
        this.c = icon;
        this.d = charSequence2;
        this.e = instant;
        this.f = credentialCountInformationMap;
        this.g = z;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("accountName must not be empty");
        }
        if (charSequence2 != null && charSequence2.length() > 300) {
            throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
        }
    }
}
