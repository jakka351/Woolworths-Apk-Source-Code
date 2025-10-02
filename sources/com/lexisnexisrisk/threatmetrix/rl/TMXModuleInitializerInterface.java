package com.lexisnexisrisk.threatmetrix.rl;

import android.util.Pair;

/* loaded from: classes6.dex */
public interface TMXModuleInitializerInterface extends TMXModuleMetadataProviderInterface {
    String getNativeLibName();

    Pair<String, Object> initialize();
}
