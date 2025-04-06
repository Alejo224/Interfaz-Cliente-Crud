## 🧪 Laboratorio Básico - Programación Orientada a Eventos

Este proyecto consiste en una aplicación Java con interfaz gráfica que implementa los fundamentos de la Programación Orientada a Eventos. Se trata de un sistema de gestión de clientes con las funcionalidades básicas de **crear, visualizar, actualizar y eliminar registros**, utilizando archivos `.csv` para el almacenamiento persistente de los datos.

### 🖥️ Funcionalidades principales

- **Menú principal** con cuatro botones:

  ![image](https://github.com/user-attachments/assets/4aec9354-cb84-4b94-a130-e51ffdef6a6c)

---

  1. **Crear Cliente**: Abre una nueva ventana donde se pueden ingresar los datos del cliente: nombre, cédula y teléfono. Incluye dos botones:
  - **Guardar**: Registra al cliente en el archivo `.csv`.
  - **Salir**: Retorna al menú principal.

    ![image](https://github.com/user-attachments/assets/fcbee098-922a-4e3a-b646-06fd4a065e9d)

  
  ---
  3. **Mostrar Cliente**: Muestra una tabla (`JTable`) con todos los clientes registrados. También tiene un botón **Back** para volver al menú principal.
  
   ![image](https://github.com/user-attachments/assets/b8f21208-6287-4513-8a9c-3f59e82c5ddc)

---  

  4. **Actualizar y Eliminar**: Abre una nueva ventana con una tabla de los datos registrados. Contiene tres botones:
     ![image](https://github.com/user-attachments/assets/5bb3b3b6-3c95-4629-8165-80737b1db05e)

     - **Eliminar**: Permite seleccionar un cliente y eliminarlo tras confirmar la validación.

       ![image](https://github.com/user-attachments/assets/58cdc464-2020-454d-b33a-903e6f880aaa)

---
   - **Actualizar**: Permite seleccionar un cliente y abrir una nueva ventana para modificar su nombre y teléfono. La cédula está inhabilitada para evitar su edición, ya que se utiliza para validar la existencia del cliente. Esta ventana incluye:
     - **Actualizar**: Guarda los cambios.
      
  ![image](https://github.com/user-attachments/assets/cfe350b9-6d3c-464e-9a65-2d39985f9481)
  
  - **Salir**: Retorna al menú principal.
   - **Back**: Vuelve al menú principal.

  5. **Salir**: Cierra la aplicación.

### 💾 Almacenamiento

Los datos de los clientes se guardan y se leen desde un archivo **CSV**, lo cual permite mantener la información registrada incluso después de cerrar el programa.

---
