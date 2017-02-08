package com.example.android.learnenglish;

/**
 * Created by Precious on 30/10/2016.
 */

/**
 * Word class represents a Vocabulary word that the user wants to learn
 * It contains a default amd a nupe translation and Image for that word.
 */
public class Word {
    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    /**
     * nupe translation for the word
     */
    private String mNupeTranslation;
    /**
     * nupe translation for the word
     */
    private int mAudioResourceId;
    /**
     * Image Resource Id for the Word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * @param defaultTranslation is the word in a language that the user is
     *                           already familiar with (such as English)
     * @param nupeTranslation    is the word for the Nupe language
     *
     * @param audioResourceId    is the recorded audio file ID for the word or sentence
     */
    public Word(String defaultTranslation, String nupeTranslation, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mNupeTranslation = nupeTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    /**
     * @param defaultTranslation is the word in a language that the user is
     *                           already familiar with (such as English)
     * @param nupeTranslation    is the word for the nupe language
     * @param imageResourceId    is the Image resource ID for the word
     * @param audioResourceId    is the recorded audio file ID for the word or sentence
     */
    public Word(String defaultTranslation, String nupeTranslation, int imageResourceId, int audioResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mNupeTranslation = nupeTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
    }


    /**
     * Get the default translation of the word
     *
     * @return the default word Translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the nupe translation of the word
     *
     * @return the default nupe translation
     */
    public String getNupeTranslation() {
        return mNupeTranslation;
    }

    /**
     * Return the imgae resource ID of the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns audio for the word or sentence.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}
