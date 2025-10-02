package com.scandit.datacapture.core.internal.sdk.localization;

import android.content.Context;
import android.content.res.Resources;
import com.scandit.datacapture.core.internal.sdk.utils.ResourceResolver;
import com.scandit.internal.sdk.bar.Localizer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/localization/AndroidLocalizer;", "Lcom/scandit/internal/sdk/bar/Localizer;", "", "key", "defaultLocalizer", "getLocalizedString", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AndroidLocalizer extends Localizer {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f18714a;

    public AndroidLocalizer(@NotNull Context context) {
        Intrinsics.h(context, "context");
        this.f18714a = context.getResources();
    }

    @Override // com.scandit.internal.sdk.bar.Localizer
    @NotNull
    public String getLocalizedString(@NotNull String key, @NotNull String defaultLocalizer) throws Resources.NotFoundException {
        Intrinsics.h(key, "key");
        Intrinsics.h(defaultLocalizer, "defaultLocalizer");
        int stringResIdentifier = ResourceResolver.INSTANCE.getStringResIdentifier(key);
        if (stringResIdentifier == 0) {
            return defaultLocalizer;
        }
        String string = this.f18714a.getString(stringResIdentifier);
        Intrinsics.g(string, "{\n            resources.getString(resId)\n        }");
        return string;
    }
}
