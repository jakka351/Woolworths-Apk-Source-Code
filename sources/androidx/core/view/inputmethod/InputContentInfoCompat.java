package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class InputContentInfoCompat {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfoCompatApi25Impl f2517a;

    @RequiresApi
    public static final class InputContentInfoCompatApi25Impl implements InputContentInfoCompatImpl {

        /* renamed from: a, reason: collision with root package name */
        public final InputContentInfo f2518a;

        public InputContentInfoCompatApi25Impl(InputContentInfo inputContentInfo) {
            this.f2518a = inputContentInfo;
        }
    }

    public static final class InputContentInfoCompatBaseImpl implements InputContentInfoCompatImpl {
    }

    public interface InputContentInfoCompatImpl {
    }

    public InputContentInfoCompat(InputContentInfoCompatApi25Impl inputContentInfoCompatApi25Impl) {
        this.f2517a = inputContentInfoCompatApi25Impl;
    }

    public final Uri a() {
        return this.f2517a.f2518a.getContentUri();
    }

    public final ClipDescription b() {
        return this.f2517a.f2518a.getDescription();
    }

    public final Uri c() {
        return this.f2517a.f2518a.getLinkUri();
    }

    public final void d() {
        this.f2517a.f2518a.requestPermission();
    }

    public final Object e() {
        return this.f2517a.f2518a;
    }
}
