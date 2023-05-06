package org.ebookdroid.droids.mupdf.codec;

import org.ebookdroid.core.codec.CodecDocument;

/**
 * 绑定pdf的打开
 * todo:关键类
 */
public class PdfContext extends MuPdfContext {

    @Override
    public CodecDocument openDocumentInner(String fileName, final String password) {
        MuPdfDocument muPdfDocument = new MuPdfDocument(this, MuPdfDocument.FORMAT_PDF, fileName,
                password);
        return muPdfDocument;
    }


}
