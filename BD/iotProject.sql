PGDMP                     
    z         
   iotProject    13.0    13.0 	    ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    256216 
   iotProject    DATABASE     j   CREATE DATABASE "iotProject" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Bolivia.1252';
    DROP DATABASE "iotProject";
                postgres    false            ?            1259    256219    products    TABLE     ?   CREATE TABLE public.products (
    id bigint NOT NULL,
    nombre character varying(250) NOT NULL,
    codigo character varying(100)
);
    DROP TABLE public.products;
       public         heap    postgres    false            ?            1259    256217    products_id_seq    SEQUENCE     ?   ALTER TABLE public.products ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.products_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
            public          postgres    false    201            ?          0    256219    products 
   TABLE DATA           6   COPY public.products (id, nombre, codigo) FROM stdin;
    public          postgres    false    201   ?       ?           0    0    products_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.products_id_seq', 3, true);
          public          postgres    false    200            #           2606    256223    products products_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.products
    ADD CONSTRAINT products_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.products DROP CONSTRAINT products_pkey;
       public            postgres    false    201            ?   2   x?3?t?ONTp??I?44000?2??,I?󌸌9C????b???? -?A     