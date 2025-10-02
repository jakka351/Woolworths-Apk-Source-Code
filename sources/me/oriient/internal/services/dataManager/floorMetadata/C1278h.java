package me.oriient.internal.services.dataManager.floorMetadata;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.SafeContinuation;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import me.oriient.internal.infra.utils.core.InternalError;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.ParsingError;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1278h implements RequestListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f25161a;
    public final /* synthetic */ C1279i b;

    public C1278h(SafeContinuation safeContinuation, C1279i c1279i) {
        this.f25161a = safeContinuation;
        this.b = c1279i;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final boolean onLoadFailed(GlideException glideException, Object obj, Target target, boolean z) {
        StringBuilder sb = new StringBuilder("Floor image loading failed: ");
        sb.append(glideException != null ? glideException.getMessage() : null);
        this.f25161a.resumeWith(new Outcome.Failure(new InternalError(sb.toString())));
        return true;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public final boolean onResourceReady(Object obj, Object obj2, Target target, DataSource dataSource, boolean z) throws Exception {
        Unit unit;
        SVG svgE;
        File file = (File) obj;
        if (file != null) {
            SafeContinuation safeContinuation = this.f25161a;
            C1279i c1279i = this.b;
            try {
                svgE = SVG.e(FilesKt.e(file, Charsets.f24671a));
            } catch (SVGParseException e) {
                Logger logger = (Logger) c1279i.c.getD();
                String string = e.toString();
                Intrinsics.g(string, "toString(...)");
                logger.d("MapImage", string);
                String message = e.getMessage();
                if (message == null) {
                    message = "Invalid SVG file";
                }
                safeContinuation.resumeWith(new Outcome.Failure(new ParsingError(message)));
            }
            if (svgE.c() == -1.0f || svgE.b() == -1.0f) {
                throw new Exception("This SVG file does not have width and height defined");
            }
            safeContinuation.resumeWith(new Outcome.Success(svgE));
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit != null) {
            return true;
        }
        this.f25161a.resumeWith(new Outcome.Failure(new InternalError("Floor image loading failed - missing file")));
        return true;
    }
}
