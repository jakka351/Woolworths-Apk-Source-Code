package androidx.camera.view;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Pair;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(final CallbackToFutureAdapter.Completer completer) throws ExecutionException, InterruptedException {
        switch (this.d) {
            case 0:
                PendingValue pendingValue = (PendingValue) this.e;
                Pair pair = pendingValue.f643a;
                if (pair != null) {
                    CallbackToFutureAdapter.Completer completer2 = (CallbackToFutureAdapter.Completer) pair.f2463a;
                    Objects.requireNonNull(completer2);
                    completer2.c();
                }
                Object obj = this.f;
                pendingValue.f643a = new Pair(completer, obj);
                return androidx.camera.core.impl.b.m(obj, "PendingValue ");
            case 1:
                final CameraInfo cameraInfo = (CameraInfo) this.e;
                ArrayList arrayList = (ArrayList) this.f;
                CameraCaptureCallback cameraCaptureCallback = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004b: CONSTRUCTOR (r2v1 'cameraCaptureCallback' androidx.camera.core.impl.CameraCaptureCallback) = 
                      (r7v0 'completer' androidx.concurrent.futures.CallbackToFutureAdapter$Completer A[DONT_INLINE])
                      (r0v4 'cameraInfo' androidx.camera.core.CameraInfo A[DONT_INLINE])
                     A[DECLARE_VAR, MD:(androidx.concurrent.futures.CallbackToFutureAdapter$Completer, androidx.camera.core.CameraInfo):void (m)] call: androidx.camera.view.PreviewStreamStateObserver.2.<init>(androidx.concurrent.futures.CallbackToFutureAdapter$Completer, androidx.camera.core.CameraInfo):void type: CONSTRUCTOR in method: androidx.camera.view.d.attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter$Completer):java.lang.Object, file: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.camera.view.PreviewStreamStateObserver, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 21 more
                    */
                /*
                    this = this;
                    int r0 = r6.d
                    switch(r0) {
                        case 0: goto L5d;
                        case 1: goto L41;
                        default: goto L5;
                    }
                L5:
                    java.lang.Object r0 = r6.e
                    androidx.camera.view.TextureViewImplementation r0 = (androidx.camera.view.TextureViewImplementation) r0
                    java.lang.Object r1 = r6.f
                    android.view.Surface r1 = (android.view.Surface) r1
                    java.lang.String r2 = "TextureViewImpl"
                    java.lang.String r3 = "Surface set on Preview."
                    androidx.camera.core.Logger.a(r2, r3)
                    androidx.camera.core.SurfaceRequest r2 = r0.h
                    java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.a()
                    androidx.camera.view.n r4 = new androidx.camera.view.n
                    r5 = 1
                    r4.<init>(r7, r5)
                    r2.a(r1, r3, r4)
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    java.lang.String r2 = "provideSurface[request="
                    r7.<init>(r2)
                    androidx.camera.core.SurfaceRequest r0 = r0.h
                    r7.append(r0)
                    java.lang.String r0 = " surface="
                    r7.append(r0)
                    r7.append(r1)
                    java.lang.String r0 = "]"
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    return r7
                L41:
                    java.lang.Object r0 = r6.e
                    androidx.camera.core.CameraInfo r0 = (androidx.camera.core.CameraInfo) r0
                    java.lang.Object r1 = r6.f
                    java.util.ArrayList r1 = (java.util.ArrayList) r1
                    androidx.camera.view.PreviewStreamStateObserver$2 r2 = new androidx.camera.view.PreviewStreamStateObserver$2
                    r2.<init>(r7, r0)
                    r1.add(r2)
                    androidx.camera.core.impl.CameraInfoInternal r0 = (androidx.camera.core.impl.CameraInfoInternal) r0
                    java.util.concurrent.Executor r7 = androidx.camera.core.impl.utils.executor.CameraXExecutors.a()
                    r0.c(r7, r2)
                    java.lang.String r7 = "waitForCaptureResult"
                    return r7
                L5d:
                    java.lang.Object r0 = r6.e
                    androidx.camera.view.PendingValue r0 = (androidx.camera.view.PendingValue) r0
                    androidx.core.util.Pair r1 = r0.f643a
                    if (r1 == 0) goto L6f
                    java.lang.Object r1 = r1.f2463a
                    androidx.concurrent.futures.CallbackToFutureAdapter$Completer r1 = (androidx.concurrent.futures.CallbackToFutureAdapter.Completer) r1
                    java.util.Objects.requireNonNull(r1)
                    r1.c()
                L6f:
                    androidx.core.util.Pair r1 = new androidx.core.util.Pair
                    java.lang.Object r2 = r6.f
                    r1.<init>(r7, r2)
                    r0.f643a = r1
                    java.lang.String r7 = "PendingValue "
                    java.lang.String r7 = androidx.camera.core.impl.b.m(r2, r7)
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.d.attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter$Completer):java.lang.Object");
            }

            public /* synthetic */ d(CameraInfo cameraInfo, PreviewStreamStateObserver previewStreamStateObserver, ArrayList arrayList) {
                this.d = 1;
                this.e = cameraInfo;
                this.f = arrayList;
            }
        }
