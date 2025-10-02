package au.com.woolworths.foundation.shop.olive.voice.di;

import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceInteractor;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceInteractorImpl;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class OliveVoiceModule_ProvidesOliveVoiceInteractorFactory implements Factory<OliveVoiceInteractor> {
    public static OliveVoiceInteractorImpl a(OliveVoiceModule oliveVoiceModule, OliveVoiceRepositoryImpl oliveVoiceRepositoryImpl) {
        return new OliveVoiceInteractorImpl(oliveVoiceRepositoryImpl);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        throw null;
    }
}
