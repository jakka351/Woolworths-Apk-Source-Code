package androidx.camera.core;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.ImageReaderProxy;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements ImageAnalysis.Analyzer, ImageReaderProxy.OnImageAvailableListener {
    public final /* synthetic */ Object d;

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void a(ImageReaderProxy imageReaderProxy) {
        MetadataImageReader metadataImageReader = (MetadataImageReader) this.d;
        synchronized (metadataImageReader.f414a) {
            metadataImageReader.c++;
        }
        metadataImageReader.j(imageReaderProxy);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void b(SettableImageProxy settableImageProxy) {
        ImageAnalysis.Analyzer analyzer = (ImageAnalysis.Analyzer) this.d;
        ImageAnalysis.Defaults defaults = ImageAnalysis.v;
        analyzer.b(settableImageProxy);
    }
}
