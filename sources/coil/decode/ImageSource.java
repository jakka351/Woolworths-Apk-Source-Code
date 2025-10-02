package coil.decode;

import coil.annotation.ExperimentalCoilApi;
import java.io.Closeable;
import okio.BufferedSource;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil/decode/ImageSource;", "Ljava/io/Closeable;", "Metadata", "Lcoil/decode/FileImageSource;", "Lcoil/decode/SourceImageSource;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ImageSource implements Closeable {

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/decode/ImageSource$Metadata;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @ExperimentalCoilApi
    public static abstract class Metadata {
    }

    public abstract BufferedSource U0();

    public abstract Metadata a();
}
