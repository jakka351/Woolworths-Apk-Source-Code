package androidx.camera.camera2.internal.compat.quirk;

import androidx.core.util.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v128 androidx.camera.core.impl.Quirks, still in use, count: 3, list:
          (r2v128 androidx.camera.core.impl.Quirks) from 0x0127: MOVE (r18v2 androidx.camera.core.impl.Quirks) = (r2v128 androidx.camera.core.impl.Quirks)
          (r2v128 androidx.camera.core.impl.Quirks) from 0x011c: MOVE (r18v4 androidx.camera.core.impl.Quirks) = (r2v128 androidx.camera.core.impl.Quirks)
          (r2v128 androidx.camera.core.impl.Quirks) from 0x00ff: MOVE (r18v7 androidx.camera.core.impl.Quirks) = (r2v128 androidx.camera.core.impl.Quirks)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // androidx.core.util.Consumer
    public final void accept(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.compat.quirk.a.accept(java.lang.Object):void");
    }
}
