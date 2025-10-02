package androidx.camera.core.internal.utils;

import android.util.Size;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* loaded from: classes2.dex */
public final class SizeUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final Size f543a = new Size(0, 0);
    public static final Size b = new Size(DilithiumEngine.DilithiumPolyT1PackedBytes, 240);
    public static final Size c = new Size(640, 480);
    public static final Size d = new Size(720, 480);
    public static final Size e = new Size(1280, 720);
    public static final Size f = new Size(1920, 1080);
    public static final Size g = new Size(1920, 1440);

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
