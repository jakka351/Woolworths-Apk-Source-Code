package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.ValueInstantiationException;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;

/* loaded from: classes4.dex */
public class NioPathDeserializer extends StdScalarDeserializer<Path> {
    public static final boolean g;

    static {
        File[] fileArrListRoots = File.listRoots();
        int length = fileArrListRoots.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String path = fileArrListRoots[i].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z = true;
                break;
            }
            i++;
        }
        g = z;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object e(JsonParser jsonParser, DeserializationContext deserializationContext) throws ValueInstantiationException, MismatchedInputException {
        Class cls = this.d;
        if (!jsonParser.a1(JsonToken.VALUE_STRING)) {
            deserializationContext.E(jsonParser, Path.class);
            throw null;
        }
        String strK0 = jsonParser.k0();
        if (strK0.indexOf(58) < 0) {
            return Paths.get(strK0, new String[0]);
        }
        if (g && strK0.length() >= 2 && Character.isLetter(strK0.charAt(0)) && strK0.charAt(1) == ':') {
            return Paths.get(strK0, new String[0]);
        }
        try {
            URI uri = new URI(strK0);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e) {
                try {
                    String scheme = uri.getScheme();
                    Iterator it = ServiceLoader.load(FileSystemProvider.class).iterator();
                    while (it.hasNext()) {
                        FileSystemProvider fileSystemProvider = (FileSystemProvider) it.next();
                        if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                            return fileSystemProvider.getPath(uri);
                        }
                    }
                    throw null;
                } catch (Throwable e2) {
                    e2.addSuppressed(e2);
                    throw null;
                }
            } finally {
                deserializationContext.y(e2, cls);
            }
        } catch (URISyntaxException e22) {
            throw null;
        }
    }
}
