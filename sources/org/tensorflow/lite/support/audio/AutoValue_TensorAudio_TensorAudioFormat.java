package org.tensorflow.lite.support.audio;

import org.tensorflow.lite.support.audio.TensorAudio;

/* loaded from: classes8.dex */
final class AutoValue_TensorAudio_TensorAudioFormat extends TensorAudio.TensorAudioFormat {

    public static final class Builder extends TensorAudio.TensorAudioFormat.Builder {
    }

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof TensorAudio.TensorAudioFormat);
    }

    public final int hashCode() {
        return -721379959;
    }

    public final String toString() {
        return "TensorAudioFormat{channels=0, sampleRate=0}";
    }
}
