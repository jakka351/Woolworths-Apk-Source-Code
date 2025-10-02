package androidx.camera.core.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public interface EncoderProfilesProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final List f488a = Collections.unmodifiableList(Arrays.asList(13, 10, 8, 11, 6, 5, 4, 9, 3, 7, 2));

    /* renamed from: androidx.camera.core.impl.EncoderProfilesProvider$1, reason: invalid class name */
    public class AnonymousClass1 implements EncoderProfilesProvider {
        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public final EncoderProfilesProxy a(int i) {
            return null;
        }

        @Override // androidx.camera.core.impl.EncoderProfilesProvider
        public final boolean b(int i) {
            return false;
        }
    }

    EncoderProfilesProxy a(int i);

    boolean b(int i);
}
