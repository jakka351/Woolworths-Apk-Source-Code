package com.woolworths.scanlibrary.di.module;

import com.woolworths.scanlibrary.domain.survey.SurveyManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class ScanNGoModule_ProvideSurveyManagerFactory implements Factory<SurveyManager> {
    public static SurveyManager a(ScanNGoModule scanNGoModule) {
        scanNGoModule.getClass();
        return new SurveyManager();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
