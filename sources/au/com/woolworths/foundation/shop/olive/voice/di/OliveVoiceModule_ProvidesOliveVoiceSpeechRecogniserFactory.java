package au.com.woolworths.foundation.shop.olive.voice.di;

import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceSpeechRecogniser;
import au.com.woolworths.foundation.shop.olive.voice.OliveVoiceSpeechRecogniserImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class OliveVoiceModule_ProvidesOliveVoiceSpeechRecogniserFactory implements Factory<OliveVoiceSpeechRecogniser> {
    public static OliveVoiceSpeechRecogniserImpl a(OliveVoiceModule oliveVoiceModule) {
        oliveVoiceModule.getClass();
        return new OliveVoiceSpeechRecogniserImpl();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a(null);
        throw null;
    }
}
