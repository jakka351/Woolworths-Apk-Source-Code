package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.ui.video.NativeCopiedCameraTexture;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class O7 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final O7 f18353a = new O7();

    public O7() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeCopiedCameraTexture nativeCopiedCameraTextureCreate = NativeCopiedCameraTexture.create();
        Intrinsics.g(nativeCopiedCameraTextureCreate, "create()");
        return nativeCopiedCameraTextureCreate;
    }
}
