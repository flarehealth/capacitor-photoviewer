import { WebPlugin } from '@capacitor/core';
import type { PhotoViewerPlugin, capEchoOptions, capEchoResult, capShowOptions, capShowResult, capHttpOptions, capHttpResult, capPaths } from './definitions';
export declare class PhotoViewerWeb extends WebPlugin implements PhotoViewerPlugin {
    private _imageList;
    private _options;
    private _mode;
    private _startFrom;
    private _container;
    private _modeList;
    private _photoViewer;
    constructor();
    echo(options: capEchoOptions): Promise<capEchoResult>;
    show(options: capShowOptions): Promise<capShowResult>;
    saveImageFromHttpToInternal(options: capHttpOptions): Promise<capHttpResult>;
    getInternalImagePaths(): Promise<capPaths>;
    private jeepPhotoViewerResult;
}
