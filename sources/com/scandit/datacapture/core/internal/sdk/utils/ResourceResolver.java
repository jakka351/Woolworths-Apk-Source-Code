package com.scandit.datacapture.core.internal.sdk.utils;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/utils/ResourceResolver;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "type", "", "getResIdentifier", "resId", "Ljava/io/InputStream;", "openRawResource", "getStringResIdentifier", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ResourceResolver {

    @NotNull
    public static final ResourceResolver INSTANCE = new ResourceResolver();

    private ResourceResolver() {
    }

    @SuppressLint
    public final int getResIdentifier(@NotNull String name, @NotNull String type) {
        Intrinsics.h(name, "name");
        Intrinsics.h(type, "type");
        AppAndroidEnvironment appAndroidEnvironment = AppAndroidEnvironment.INSTANCE;
        return appAndroidEnvironment.getApplicationContext().getResources().getIdentifier(name, type, appAndroidEnvironment.getApplicationContext().getPackageName());
    }

    public final int getStringResIdentifier(@NotNull String name) {
        Intrinsics.h(name, "name");
        return getResIdentifier(name, "string");
    }

    @NotNull
    public final InputStream openRawResource(int resId) throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource = AppAndroidEnvironment.INSTANCE.getApplicationContext().getResources().openRawResource(resId);
        Intrinsics.g(inputStreamOpenRawResource, "AppAndroidEnvironment.ap…es.openRawResource(resId)");
        return inputStreamOpenRawResource;
    }
}
