package androidx.camera.core;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.ImageReaderProxy;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                AndroidImageReaderProxy androidImageReaderProxy = (AndroidImageReaderProxy) obj2;
                androidImageReaderProxy.getClass();
                ((ImageReaderProxy.OnImageAvailableListener) obj).a(androidImageReaderProxy);
                break;
            case 1:
                SafeCloseImageReaderProxy safeCloseImageReaderProxy = (SafeCloseImageReaderProxy) obj;
                ImageAnalysis.Defaults defaults = ImageAnalysis.v;
                ((SafeCloseImageReaderProxy) obj2).g();
                if (safeCloseImageReaderProxy != null) {
                    safeCloseImageReaderProxy.g();
                    break;
                }
                break;
            case 2:
                MetadataImageReader metadataImageReader = (MetadataImageReader) obj2;
                metadataImageReader.getClass();
                ((ImageReaderProxy.OnImageAvailableListener) obj).a(metadataImageReader);
                break;
            default:
                Preview.Defaults defaults2 = Preview.w;
                ((Preview.SurfaceProvider) obj2).a((SurfaceRequest) obj);
                break;
        }
    }
}
