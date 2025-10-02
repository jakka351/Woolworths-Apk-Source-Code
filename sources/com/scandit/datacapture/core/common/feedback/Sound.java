package com.scandit.datacapture.core.common.feedback;

import android.content.res.Resources;
import androidx.annotation.RawRes;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0013\b\u0017\u0012\b\b\u0001\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Sound;", "", "", "toJson", "other", "", "equals", "", "hashCode", "a", "I", "getResourceId", "()I", "resourceId", "b", "Ljava/lang/String;", "getAssetName", "()Ljava/lang/String;", "assetName", "<init>", "(I)V", "(Ljava/lang/String;)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public class Sound {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int resourceId;

    /* renamed from: b, reason: from kotlin metadata */
    private final String assetName;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, d2 = {"Lcom/scandit/datacapture/core/common/feedback/Sound$Companion;", "", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "defaultSound", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Sound defaultSound() {
            return new ResourceSound(R.raw.sc_beep);
        }

        private Companion() {
        }
    }

    @Deprecated
    public Sound(@RawRes int i) {
        this.resourceId = i;
        this.assetName = null;
    }

    @JvmStatic
    @NotNull
    public static final Sound defaultSound() {
        return INSTANCE.defaultSound();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sound)) {
            return false;
        }
        Sound sound = (Sound) other;
        return this.resourceId == sound.resourceId && Intrinsics.c(this.assetName, sound.assetName);
    }

    @Nullable
    public final String getAssetName() {
        return this.assetName;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    public int hashCode() {
        int i = this.resourceId * 31;
        String str = this.assetName;
        return i + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toJson() throws JSONException, Resources.NotFoundException {
        JSONObject jSONObject = new JSONObject();
        String resourceEntryName = this.assetName;
        if (resourceEntryName == null) {
            resourceEntryName = AppAndroidEnvironment.INSTANCE.getApplicationContext().getResources().getResourceEntryName(this.resourceId);
            Intrinsics.g(resourceEntryName, "AppAndroidEnvironment.ap…urceEntryName(resourceId)");
        }
        jSONObject.put("resource", resourceEntryName);
        String string = jSONObject.toString();
        Intrinsics.g(string, "JSONObject().apply {\n   …urceId))\n    }.toString()");
        return string;
    }

    @Deprecated
    public Sound(@NotNull String assetName) {
        Intrinsics.h(assetName, "assetName");
        this.resourceId = 0;
        this.assetName = assetName;
    }
}
