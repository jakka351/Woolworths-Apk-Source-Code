package com.scandit.datacapture.core.internal.sdk.extensions;

import android.content.Context;
import android.media.SoundPool;
import com.scandit.datacapture.core.common.feedback.Sound;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0007\u001a\u00060\u0005j\u0002`\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000*\f\b\u0000\u0010\b\"\u00020\u00052\u00020\u0005¨\u0006\t"}, d2 = {"Landroid/media/SoundPool;", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/common/feedback/Sound;", "sound", "", "Lcom/scandit/datacapture/core/internal/sdk/extensions/SoundId;", "load", "SoundId", "scandit-capture-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SoundPoolExtensionsKt {
    public static final int load(@NotNull SoundPool soundPool, @NotNull Context context, @NotNull Sound sound) {
        Intrinsics.h(soundPool, "<this>");
        Intrinsics.h(context, "context");
        Intrinsics.h(sound, "sound");
        if (sound.getResourceId() != 0) {
            return soundPool.load(context, sound.getResourceId(), 1);
        }
        if (sound.getAssetName() == null) {
            return 0;
        }
        String str = (String) CollectionsKt.D(StringsKt.T(sound.getAssetName(), new String[]{"."}, 6));
        int resourceByName = ContextExtensionsKt.getResourceByName(context, str);
        if (resourceByName <= 0 && !StringsKt.W(str, "sc_", false)) {
            resourceByName = ContextExtensionsKt.getResourceByName(context, "sc_".concat(str));
        }
        return resourceByName > 0 ? soundPool.load(context, resourceByName, 1) : soundPool.load(ContextExtensionsKt.openAssetFd(context, sound.getAssetName()), 1);
    }
}
